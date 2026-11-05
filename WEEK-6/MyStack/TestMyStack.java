package MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("Kahramanmaraş");
        stack1.push("İzmir");
        stack1.push("Java");

        // stack1'in deep copy'sini oluşturuyoruz
        MyStack stack2 = (MyStack) stack1.clone();

        // Orijinal stack1'e yeni eleman ekleyelim
        stack1.push("OOP");

        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2 (Kopya): " + stack2);

        // Bağımsızlık kontrolü
        System.out.println("\nStack 1 boyutu: " + stack1.getSize()); // 4
        System.out.println("Stack 2 boyutu: " + stack2.getSize()); // 3 (Değişmedi!)
    }
}