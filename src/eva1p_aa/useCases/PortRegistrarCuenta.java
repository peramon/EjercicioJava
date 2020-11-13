package eva1p_aa.useCases;

import eva1p_aa.entities.Cuenta;

public class PortRegistrarCuenta {
    public RegistrarCuenta registroDeCuenta;

    public void RegistrarCuenta(Cuenta cuenta) {
        this.registroDeCuenta.registrarCuenta(cuenta);
    }

    public PortRegistrarCuenta(RegistrarCuenta registrodecuenta) {
        this.registroDeCuenta = registrodecuenta;
    }

    public PortRegistrarCuenta() {
    }
}
