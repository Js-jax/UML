package POO;

public class index {
  public static void main(String[] args) {
    atencionc op1 = new atencionc();
    cliente op = new cliente();
    agencia op2 = new agencia();
    reservacion op3 = new reservacion();
    pago op4 = new pago();

    op.Reservacion();
    op1.Atencion();
    op2.Alautos();
    op3.alquilerH();
    op3.alquilerD();
    op4.efectivo();
    op4.transferencia();
    op4.puntoventa();

  }
}
