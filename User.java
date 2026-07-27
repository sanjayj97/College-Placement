class User{
    String userId;
    String name;
    String email;
    String password;
    String phone;

    public User(String userId, String name, String email, String password, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
    
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }


    public boolean logout() {
        System.out.println("Logout successful!");
        return true;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully!");
            return true;
        } else {
            System.out.println("Old password is incorrect.");
            return false;
        }
    }
}