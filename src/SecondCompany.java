public class SecondCompany {
    public static void main(String[] args) {
        String companyName = "TechCorp";
        double revenue = 75000;
        double salaries = 35000;
        double rent = 8000;
        double tools = 5000;

        double totalCost = salaries + rent + tools;
        double profit = revenue - totalCost;

        boolean profitable = profit > 0;
        boolean canOperate = revenue >= totalCost;

        System.out.println("Company: " + companyName);
        System.out.println("Revenue: " + revenue);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Profit: " + profit);
        System.out.println("Profitable: " + profitable);
        System.out.println("Can operate: " + canOperate);
    }
}
