//package com.tbcmad.todoapp.model;
//
//import androidx.annotation.NonNull;
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//
//import androidx.room.PrimaryKey;
//
//
//
//@Entity(tableName = "db")
//public class User {
//
//    @PrimaryKey(autoGenerate = true)
//    private int id;
//
//    @NonNull
//    @ColumnInfo(name = "username")
//    private String userName;
//
//    @NonNull
//    @ColumnInfo(name = "password")
//    private String password;
//
//    @NonNull
//    @ColumnInfo(name = "email")
//    private String email ;
//
//
//
//    public User(String userName, String password, String email) {
//        this.userName = userName;
//        this.password = password;
//        this.email = email;
//    }
//
//    @NonNull
//    public int getId() {
//        return id;
//    }
//
//    public void setId(@NonNull int id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//   @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
//import com.tbcmad.todoapp.data.UserDao;


//LINE 62
//    private static class PopulateDbAsync1 extends AsyncTask<User,Void,Void> {
//
//        private UserDao userdao;
//        private PopulateDbAsync1(TodoRoomDatabase db)
//        {
//
//            userdao=db.userdao();
//        }
//
//
//
//        @Override
//        protected Void doInBackground(User... users) {
//
//            return null;
//        }
//    }
