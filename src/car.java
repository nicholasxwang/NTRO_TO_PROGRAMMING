public class car {
    public static void main(String[] args){
        //You want to decide whether you should drive your car to work or take the train.
        // You know the one-way distance from your home to your place of work, and the fuel efficiency of your car (in miles per gallon).
        // You also know the one-way price of a train ticket. You assume the cost of gas at $4 per gallon, and car maintenance at 5 cents per mile.
        // Write an algorithm to decide which commute is cheaper.

        int train_ticket = 20;

        int fuel_efficiency = 10;

        int price_of_gas = 4;

        int distance_to_work = 10;

        double car_maintence = 0.05;

        int car_price = (int) (price_of_gas * (distance_to_work / fuel_efficiency) + distance_to_work * car_maintence);

        if (car_price == train_ticket){
            System.out.println("Same price");
        }else if(car_price > train_ticket){
            System.out.println("Train is cheaper");
        }else{
            System.out.println("Driving is cheaper");
        }

    }
}
