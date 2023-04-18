package com.example.cleansystem.acceptanceTest;
import static org.junit.Assert.assertEquals;

import java.util.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.concurrent.Worker;
import org.junit.jupiter.api.Order;

public class feature8 {
    private List<Worker> workers;
    private List<String> orders = new ArrayList<>();
    private Map<String, String> orderToWorkerMap = new HashMap<>();
    private Map<String, String> workerToOrderMap = new HashMap<>();
    private Map<String, Integer> workerToOrderCountMap = new HashMap<>();
    private Map<String, Integer> orderPriorityMap = new HashMap<>();
    @Given("there are orders to be fulfilled")
    public void there_are_orders_to_be_fulfilled() {
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
    }

    @Given("there are workers available to fulfill them")
    public void there_are_workers_available_to_fulfill_them() {
        workerToOrderCountMap.put("Worker1", 0);
        workerToOrderCountMap.put("Worker2", 0);
    }

    @When("the system assigns orders to workers")
    public void the_system_assigns_orders_to_workers() {
        for (String order : orders) {
            String worker = getAvailableWorker();
            orderToWorkerMap.put(order, worker);
            workerToOrderMap.put(worker, order);
            workerToOrderCountMap.put(worker, workerToOrderCountMap.get(worker) + 1);
        }
    }

    private String getAvailableWorker() {
        return null;
    }

    @Then("each worker should have at least one order assigned to them")
    public void each_worker_should_have_at_least_one_order_assigned_to_them() {
        for (String worker : workerToOrderCountMap.keySet()) {
            assertEquals(1, (int) workerToOrderCountMap.get(worker));
        }
    }

    @Given("orders have been assigned to workers")
    public void orders_have_been_assigned_to_workers() {
        orderToWorkerMap.put("Order1", "Worker1");
        orderToWorkerMap.put("Order2", "Worker2");
        orderToWorkerMap.put("Order3", "Worker1");
    }

    @When("the manager monitors the progress in real-time")
    public void the_manager_monitors_the_progress_in_real_time() {
        for (String worker : workerToOrderMap.keySet()) {
            String order = workerToOrderMap.get(worker);
            System.out.println("Worker: " + worker + " is working on Order: " + order);
        }
    }

    @Then("they should be able to see which orders are being worked on and which workers are available")
    public void they_should_be_able_to_see_which_orders_are_being_worked_on_and_which_workers_are_available() {
        for (String worker : workerToOrderMap.keySet()) {
            String order = workerToOrderMap.get(worker);
            System.out.println("Worker: " + worker + " is working on Order: " + order);
        }
        for (String worker : workerToOrderCountMap.keySet()) {
            if (workerToOrderCountMap.get(worker) == 0) {
                System.out.println("Worker: " + worker + " is available");
            }
        }
    }

    @Given("there are orders with different levels of urgency and importance")
    public void there_are_orders_with_different_levels_of_urgency_and_importance() {
        orderPriorityMap.put("Order1", 1);
        orderPriorityMap.put("Order2", 2);
        orderPriorityMap.put("Order3", 3);
    }

    @When("the system prioritizes the orders")
    public void the_system_prioritizes_the_orders() {
        // Write code here that turns the phrase above into concrete actions
        Object orderService = null;
        Class<?> orders = orderService.getClass();

        // Prioritize the orders based on urgency and importance
        Collections.sort(orders, new OrderPriorityComparator());

        // Update the order priority in the database
        for (Order order : orders) {
            orderService.toString(
            );
        }
    }
    @Then("the most urgent and important orders should be assigned to workers first")
    public void the_most_urgent_and_important_orders_should_be_assigned_to_workers_first() {
        // Write code here that turns the phrase above into concrete actions
        PriorityQueue<String> orderQueue = new PriorityQueue<String>(new OrderComparator());
        for (String order : orders) {
            orderQueue.offer(order);
        }
        Worker[] workers = new Worker[0];
        for (Worker worker : workers) {
            while (!orderQueue.isEmpty()) {
                String order = orderQueue.poll();
                if (order !=z null && worker.hashCode()) {
                    break;
                }
            }
        }
    }


    @Given("there are multiple workers available to fulfill orders")
    public void there_are_multiple_workers_available_to_fulfill_orders() {


        // Write code here that turns the phrase above into concrete actions
        workers = new ArrayList<>();
       // workers.add(new Worker("sulaiman"));

    }

    @Then("the workload should be distributed evenly among them")
    public void the_workload_should_be_distributed_evenly_among_them() {
        // Write code here that turns the phrase above into concrete actions
        int numWorkers = workers.size();
        int numOrders = orders.size();
        int ordersPerWorker = numOrders / numWorkers;
        int remainingOrders = numOrders % numWorkers;

        // assign orders to workers
        int orderIndex = 0;
        for (int i = 0; i < numWorkers; i++) {
            int numOrdersToAssign = ordersPerWorker;
            if (remainingOrders > 0) {
                numOrdersToAssign++;
                remainingOrders--;
            }

            List<String> ordersAssigned = orders.subList(orderIndex, orderIndex + numOrdersToAssign);
            workers.get(i).hashCode();
            orderIndex += numOrdersToAssign;
        }


    }
}
