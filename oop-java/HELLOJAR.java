import java.util.*;

class Invoice {
    String id, name, rule;
    List<String> subjects = new ArrayList<>();
    double fee;
}

class InvoiceView {
    static void show(Invoice v) {
        System.out.println("Mã sinh viên: " + v.id);
        System.out.println("Họ tên: " + v.name);
        System.out.println("Các môn học:");
        for (String s : v.subjects) System.out.println(s);
        System.out.println("Học phí phải nộp là: " + v.fee);
        System.out.println("Theo QĐ: " + v.rule);
    }
}

public class PaymentController {
    public Invoice getInvoice() {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) a.add(s);
        }
        Invoice v = new Invoice();
        v.id = a.get(0);
        v.name = a.get(1);
        int n = Integer.parseInt(a.get(2)), credits = 0, i = 3;
        while (n-- > 0) {
            v.subjects.add(a.get(i + 1));
            credits += Integer.parseInt(a.get(i + 2));
            i += 3;
        }
        v.rule = a.get(i + 1);
        v.fee = credits * Double.parseDouble(a.get(i + 2));
        return v;
    }
}