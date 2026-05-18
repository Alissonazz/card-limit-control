package Bancario;

public class Shopping implements Comparable<Shopping> {
    private String description;
    private double value;

    public Shopping(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + description +
                " valor =" + value;
    }

    @Override
    public int compareTo(Shopping outrasCompras) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(outrasCompras.value));
    }
}