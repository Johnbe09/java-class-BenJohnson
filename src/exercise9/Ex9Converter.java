package exercise9;

/**
 * Class Ex9Converter
 * @author ben
 */
public class Ex9Converter {
    public Ex9Converter() {}
    
  public Double c2f(Double valueFrom) {
    double f = (valueFrom * 9 / 5) + 32;
    return f;
  }

  public Double c2k(Double valueFrom) {
    double k = valueFrom + 273.15;
    return k;
  }

  public Double f2c(Double valueFrom) {
    double c = (valueFrom - 32) * 5 / 9;
    return c;
  }

  public Double f2k(Double valueFrom) {
    double k = (((valueFrom -32) *5 / 9) + 273.15);
    return k;
  }

  public Double k2c(Double valueFrom) {
    return valueFrom - 273.15;
  }

  public Double k2f(Double valueFrom) {
    double f = ((valueFrom - 273.15) * 9 / 5) + 32;
    return f;
  }
}
