/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto3.reto3.interfaces;

import com.reto3.reto3.tablas.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface interfaceReservation extends CrudRepository<Reservation, Integer>{
    
}
