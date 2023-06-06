package com.amusementBookingApplication.Pojos;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TicketOutput {
    
    public int id;
    public String activityName;
    public float charge;
    public LocalDateTime d;
    
}
