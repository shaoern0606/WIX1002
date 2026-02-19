package com.guild.roles;

public class Role {
    private String name;
    private Integer age;
    private String race;
    private Double mana;
    
    public Role() {
        name = null;
        age = 0;
        race = null;
        mana = 0.0;
//        name = "Unknown";
//        age = null;
//        race = "Unknown";
//        mana = 0.0;
    }
    
    public Role(String n, Integer a, String r, Double m) {
        this.name = n;
        this.age = a;
        this.race = r;
        this.mana = m;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public String getRace() {
        return race;
    }
    
    public Double getMana() {
        return mana;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setAge(Integer a) {
        this.age = a;
    }
    
    public void setRace(String r) {
        this.race = r;
    }
    
    public void setMana(Double m) {
//        if (mana != null && mana < 0){
//            throw new IllegalArgumentException("Mana cannot be negative");
//        }
        this.mana = m;
    }
    
    public void performAction() {
        System.out.println(name + " is performing a magical action.");
    }
    
//    @Override
//    public String toString() {
//        return "Name: " + name +
//               ", Age: " + age +
//               ", Race: " + race +
//               ", Mana: " + mana;
//    }
}
