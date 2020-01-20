package courses.practice.lesson02;

import static java.util.Objects.isNull;

public final class B {
    private final String description;
    private final A a;

    public B(String description, A a) {
        this.description = description;
        this.a = isNull(a) ? null : new A(a.getCode());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("B{");
        sb.append("description='").append(description).append('\'');
        sb.append(", a=").append(a);
        sb.append('}');
        return sb.toString();
    }

    public String getDescription() {
        return description;
    }

    public A getA() {
        return a;
    }
}
