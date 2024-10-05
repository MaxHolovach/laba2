package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<House> houses = new ArrayList<>();
        houses.add(new House(1, 101, 85, 3, 3, "Shevchenka St."));
        houses.add(new House(2, 202, 65, 5, 2, "Lvivska St."));
        houses.add(new House(3, 303, 120, 7, 4, "Khreshchatyk St."));
        houses.add(new House(4, 404, 55, 2, 1, "Bandera St."));

        printHousesByRooms(houses, 3);
        printHousesByRoomsAndFloorRange(houses, 2, 3, 5);
        printHousesByArea(houses, 70);
    }

    /**
     *
     * @params Метод для виведення будинків із заданою кількістю кімнат
     * @param houses
     * @param rooms
     */
    public static void printHousesByRooms(List<House> houses, int rooms)
    {
        System.out.println("Houses with " + rooms + " rooms:");
        for (House house : houses)
        {
            if (house.getRooms() == rooms)
            {
                System.out.println(house);
            }
        }
    }

    /**
     *
     * @params Метод для виведення будинків із заданою кількістю кімнат і поверхом у певному діапазоні
     * @param houses
     * @param rooms
     * @param minFloor
     * @param maxFloor
     */
    public static void printHousesByRoomsAndFloorRange(List<House> houses, int rooms, int minFloor, int maxFloor) {

        System.out.println("Houses with " + rooms + " rooms on floors between " + minFloor + " and " + maxFloor + ":");
        for (House house : houses)
        {
            if (house.getRooms() == rooms && house.getFloor() >= minFloor && house.getFloor() <= maxFloor)
            {
                System.out.println(house);
            }
        }
    }

    /**
     *
     * @params Метод для виведення будинків, площа яких перевищує задану
     * @param houses
     * @param area
     */

    public static void printHousesByArea(List<House> houses, double area)
    {
        System.out.println("Houses with area greater than " + area + " sq.m:");
        for (House house : houses)
        {
            if (house.getArea() > area)
            {
                System.out.println(house);
            }
        }
    }
}
