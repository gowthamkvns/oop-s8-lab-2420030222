package lab5;

class Transport {
    void ticketPrice() {
        System.out.println("Ticket price for transport varies.");
    }
}

class Bus extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Ticket price for Bus: $2.50");
    }
}

class Train extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Ticket price for Train: $5.00");
    }
}

public class Transportation {
    public static void main(String[] args) {
        Transport myBus = new Bus();
        myBus.ticketPrice();

        Transport myTrain = new Train();
        myTrain.ticketPrice();
    }
}