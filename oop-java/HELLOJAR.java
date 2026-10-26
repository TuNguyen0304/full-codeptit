import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Subject {
    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;

    public Subject(String maMonHoc, String tenMonHoc, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }
}

class Invoice {
    private String maSinhVien;
    private String hoTen;
    private List<Subject> monHoc;
    private String soQD;
    private String tenQD;
    private double donGia;

    public Invoice(String maSinhVien, String hoTen, List<Subject> monHoc, String soQD, String tenQD, double donGia) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.monHoc = monHoc;
        this.soQD = soQD;
        this.tenQD = tenQD;
        this.donGia = donGia;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public List<Subject> getMonHoc() {
        return monHoc;
    }

    public String getSoQD() {
        return soQD;
    }

    public double getHocPhi() {
        double tong = 0;
        for (Subject s : monHoc) tong += s.getSoTinChi() * donGia;
        return tong;
    }
}

class PaymentController {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String readLine() throws Exception {
        String s;
        do {
            s = br.readLine();
            if (s == null) return "";
            s = s.trim();
        } while (s.isEmpty());
        return s;
    }

    public Invoice getInvoice() {
        try {
            String maSV = readLine();
            String hoTen = readLine();
            int n = Integer.parseInt(readLine());

            List<Subject> ds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String maMH = readLine();
                String tenMH = readLine();
                int soTC = Integer.parseInt(readLine());
                ds.add(new Subject(maMH, tenMH, soTC));
            }

            String soQD = readLine();
            String tenQD = readLine();
            double donGia = Double.parseDouble(readLine());

            return new Invoice(maSV, hoTen, ds, soQD, tenQD, donGia);
        } catch (Exception e) {
            return new Invoice("", "", new ArrayList<Subject>(), "", "", 0);
        }
    }
}

class InvoiceView {
    public static void show(Invoice invoice) {
        System.out.println("Mã sinh viên: " + invoice.getMaSinhVien());
        System.out.println("Họ tên: " + invoice.getHoTen());
        System.out.println("Các môn học:");
        for (Subject s : invoice.getMonHoc()) {
            System.out.println(s.getTenMonHoc());
        }
        System.out.println("Học phí phải nộp là: " + invoice.getHocPhi());
        System.out.println("Theo QĐ: " + invoice.getSoQD());
    }
}

public class HELLOJAR {
}