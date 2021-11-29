package cn.luoyvdi.pojo;

import java.util.*;

public class student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> cart;
    private Set<String> game;
    private String wife;
    private Properties info;


    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", cart=" + cart +
                ", game=" + game +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCart() {
        return cart;
    }

    public void setCart(Map<String, String> cart) {
        this.cart = cart;
    }

    public Set<String> getGame() {
        return game;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
