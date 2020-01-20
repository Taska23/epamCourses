package courses.practice.lesson02;

public class A {
    private int code;

    public A(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A{");
        sb.append("code=").append(code);
        sb.append('}');
        return sb.toString();
    }
}
