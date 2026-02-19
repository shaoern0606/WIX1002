/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;

/**
 *
 * @author shaoern
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(2500, "Product A", "January 2016");
        dataset.addValue(1600, "Product A", "February 2016");
        dataset.addValue(2000, "Product A", "March 2016");
        dataset.addValue(2700, "Product A", "April 2016");
        dataset.addValue(3200, "Product A", "May 2016");
        dataset.addValue(800,  "Product A", "June 2016");

        // Create bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Total Sales of Product A (2016)", // Chart title
                "Month",                           // X-axis label
                "Sales (RM)",                      // Y-axis label
                dataset
        );
        
        // Display chart in a frame
        ChartFrame frame = new ChartFrame("Sales Chart", chart);
        frame.pack();
        frame.setVisible(true);
    }
    
}
