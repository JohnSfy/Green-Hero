package com.example.green_hero;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.green_hero.model.User.ClassicUser;

import org.bson.types.ObjectId;

import io.realm.Realm;

public class MainViewModel extends ViewModel {
    private Realm realm = DB.realm;

    public void insertEntry() {
        if (realm == null) {
            Log.e("QUICKSTART", "Realm is null. Did you forget to call DB.init()?");
            return;
        }
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                ClassicUser user = new ClassicUser("Dimitris", "dimsparagis@gmail.com",
                        "1234", "user", 0, 0);
                realm.insert(user);
                Log.v("QUICKSTART", "Successfully inserted user.");
            }
        });
    }
}
