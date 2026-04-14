class DynamoRunner {
    public static void main(String[] args) {
        Dynamo dynamo = new Dynamo();

        dynamo.save("SmallDynamo");
        dynamo.save("BikeDynamo");
        dynamo.save("Generator");
        dynamo.save("Motor");
        dynamo.save("PowerUnit");

        dynamo.search("Generator");
    }
}