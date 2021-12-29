package com.example.demo.Presistence;

import com.example.demo.Core.User;

public interface StorageManagement {

    public default void SaveAs(User user){}

}
