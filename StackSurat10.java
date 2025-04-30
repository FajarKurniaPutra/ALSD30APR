public class StackSurat10 {
    Surat10[] stack;
    int top;
    int size;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima dari " + surat.namaMahasiswa);
        } else {
            System.out.println("Tumpukan surat penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat dalam tumpukan.");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
