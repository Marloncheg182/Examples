package dao;

import model.Profile;

/**
 * Created by Dell on 7/26/2015.
 */
public interface ProfileDAO {

 public int createProfile(Profile profile);

    public Profile loginProfile(Profile profile);

}
