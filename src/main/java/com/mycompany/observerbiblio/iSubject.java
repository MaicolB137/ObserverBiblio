/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.observerbiblio;

/**
 *
 * @author Michael
 */
public interface iSubject {
    public void register(Observer ob);
    public void unregister (Observer ob);
    public void notifyObservers();
}
