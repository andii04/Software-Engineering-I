package Airport.Base;

import Airport.Airport.GateID;

import java.util.ArrayList;

public class BoardingPass{
private String uuid;
private Carrier carrier;
private String flight;
private Passenger passenger;
private TicketClass ticketClass;
private Source source;
private Destination destination;
private String date;
private GateID gate;
private String boardingTime;
private String seat;
private ArrayList<BaggageIdentificationTag> baggageIdentifikationTagList;

public BoardingPass(String uuid, Carrier carrier, String flight, Passenger passenger, TicketClass ticketClass, Source source, Destination destination,
        String date, GateID gate, String boardingTime, String seat, ArrayList<BaggageIdentificationTag> baggageIdentifikationTagList){
        this.uuid = uuid;
        this.carrier = carrier;
        this.flight = flight;
        this.passenger = passenger;
        this.ticketClass = ticketClass;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.gate = gate;
        this.boardingTime = boardingTime;
        this.seat = seat;
        this.baggageIdentifikationTagList = baggageIdentifikationTagList;
        }

}