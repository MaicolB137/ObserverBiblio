/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerbiblio;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Subject implements iSubject {

    //Declarar estructura a manejar suscriptores
    private ArrayList<Observer> observerList;
    //Atributo con estado
    private int flag;

    public Subject() {
        observerList = new ArrayList <Observer>();
    }
    
    
    
    public ArrayList<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(ArrayList<Observer> observerList) {
        this.observerList = observerList;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        //Indica que el estado de flag cambiò
        this.flag = flag;
        //Notificar a los observadores el cambio de estado
        notifyObservers();
    }
    
    
    public void register(Observer ob) {
        observerList.add(ob);
    }

    public void unregister(Observer ob) {
        observerList.remove(ob);
    }

    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
    
}
