/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Models;

import java.util.ArrayList;

/**
 *
 * @author stoff
 */
public class Model_Cart {

    public class Cart {

        private ArrayList<Model_Carport> carports = new ArrayList();
        private int userID;

        /**
         *
         * @param id
         */
        public Cart(int id) {
            this.userID = id;
        }

        /**
         *
         * @return list of carports
         */
        public ArrayList<Model_Carport> getCarport() {
            return carports;
        }

        /**
         *
         * @param carport
         */
        public void setCarport(ArrayList<Model_Carport> carport) {
            this.carports = carport;
        }

        /**
         * adds carport to cart
         *
         * @param carport
         */
        public void addToCart(Model_Carport carport) {
            carports.add(carport);
        }

        /**
         * deletes contents of the arraylist and returns a new cart
         */
        public void clearCart() {
            carports = new ArrayList();
        }

        /**
         *
         * @param itemNumber
         */
        public void removeSpecificItem(int itemNumber) {
            carports.remove(itemNumber);
        }
    }
}
