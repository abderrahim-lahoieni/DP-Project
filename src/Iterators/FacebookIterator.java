package Iterators;

import Profile.Profile;
import java.util.ArrayList;
import java.util.List;
import social_networks.Facebook;

public class FacebookIterator implements ProfileIterator {

    private Facebook facebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    // Lazy load emails from the Facebook object
    private void lazyLoad() {
        if (emails.isEmpty()) {
            if (facebook == null) {  // Check for null `facebook` instance
                throw new IllegalStateException("Facebook instance is not initialized.");
            }

            // Get the list of friends' emails for the given type (e.g., "friends")
            List<String> friendEmails = facebook.requestProfileFriendsFromFacebook(this.email, this.type);

            // Safely handle null return values from `requestProfileFriendsFromFacebook`
            if (friendEmails != null) {
                for (String profile : friendEmails) {
                    this.emails.add(profile);
                    this.profiles.add(null);  // Initialize with null as placeholders
                }
            } else {
                System.err.println("Warning: Facebook returned null for requestProfileFriendsFromFacebook.");
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();  // Lazy-load only when required
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);

        // Lazy-fetch the profile if not already loaded
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }

        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}