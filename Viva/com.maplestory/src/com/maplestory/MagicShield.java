package com.maplestory;

class MagicShield {
    private double radius;
    private double thickness;
    private String elementType;
    
    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS = 5.0;
    private static int shieldCount = 0;
    
    public MagicShield() {
        this.radius = DEFAULT_RADIUS;
        this.thickness = DEFAULT_THICKNESS;
        this.elementType = "Neutral";
        shieldCount++;
    }
    
     public MagicShield(double radius, double thickness, String elementType) {
        setRadius(radius);
        setThickness(thickness);
        setElementType(elementType);
        shieldCount++;
    }
     
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        if (!isValidSize(radius)) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }
    
    public double getThickness() {
        return thickness;
    }
    
    public void setThickness(double thickness) {
        if (!isValidSize(thickness)) {
            throw new IllegalArgumentException("Invalid thickness");
        }
        this.thickness = thickness;
    }
    
    public String getElementType() {
        return elementType;
    }
    
    public void setElementType(String elementType) {
        if (elementType == null || elementType.trim().isEmpty()) {
            this.elementType = "Neutral";
        } else {
            this.elementType = elementType;   
        }
    }
    
    public double calculateDefensePower() {
        return (radius * thickness) * getElementCoefficient(elementType);
    }
    
    public double calculateManaCost() {
        return radius * 10 + thickness * 2;
    }
    
    public static int getShieldCount() {
        return shieldCount;
    }
    
    public static boolean isValidSize(double size) {
        return size >= 0;
    }
    
    public static double calculateDefensePower(double radius, double thickness, String elementType) {
        return (radius * thickness) * getElementCoefficient(elementType);
    }
    
    public static double calculateManaCost(double radius, double thickness) {
        return radius * 10 + thickness * 2;
    }
    
    public static double getElementCoefficient(String elementType) {
//        if (elementType.equals("Fire"))
//            return 1.1;
//        else if (elementType.equals("Ice"))
//            return 1.2;
//        else if (elementType.equals("Light"))
//            return 1.3;
//        else if (elementType.equals("Dark"))
//            return 1.4;
//        else
//            return 1.0;
        
        double elementCoefficient;
        elementCoefficient = switch (elementType) {
            case "Fire" -> 1.1;
            case "Ice" -> 1.2;
            case "Light" -> 1.3;
            case "Dark" -> 1.4;
            default -> 1.0;
        };
        return elementCoefficient;
    }
    
    @Override
    public String toString() {
//        return "[Magic Shield Info]\n"
//             + "Element Type: " + elementType + "\n" 
//             + "Radius: " + radius + " m \n"
//             + "Thickness: " + thickness + " cm \n"
//             + "Defense Power: " + String.format("%.2f", calculateDefensePower()) + "\n"
//             + "Mana Cost: " + String.format("%.1f", calculateManaCost());
        return String.format(
            """
            [MagicShield Info]
            Element Type: %s
            Radius: %.1f m
            Thickness: %.1f cm
            Defense Power: %.2f
            Mana Cost: %.1f""", elementType, radius, thickness, calculateDefensePower(), calculateManaCost()
        );
    }
}