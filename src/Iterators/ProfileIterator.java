/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterators;

import Profile.Profile;

/**
 *
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
