package EXERCICE_2_OCP;

import java.util.List;

public class Order {
    private List<LineItem> lineItems;
    private Shipping shipping;

    // Constructeur
    public Order(List<LineItem> lineItems, Shipping shipping) {
        this.lineItems = lineItems;
        this.shipping = shipping;
    }

    // Méthode pour calculer les frais d'expédition
    public double getShippingCost() {
        if (shipping.getType().equals("ground")) {
            // Free ground delivery on big orders.
            if (getTotal() > 100) {
                return 0;
            }

            // $1.5 per kilogram, but $10 minimum.
            return Math.max(10, getTotalWeight() * 1.5);
        } else if (shipping.getType().equals("air")) {
            // $3 per kilogram, but $20 minimum.
            return Math.max(20, getTotalWeight() * 3);
        }

        return 0; // Handle other shipping types if needed
    }

    // Méthode pour calculer le total de la commande
    public double getTotal() {
        // Logique de calcul du total
        return 0;
    }

    // Méthode pour calculer le poids total de la commande
    public double getTotalWeight() {
        // Logique de calcul du poids total
        return 0;
    }


          public class LineItem {
    // Définition de la classe LineItem
    // ...
       }

  public class Shipping {
    private String type;

    // Constructeur
    public Shipping(String type) {
        this.type = type;
    }

    // Méthode pour obtenir le type d'expédition
    public String getType() {
        return type;
    }
}

}

