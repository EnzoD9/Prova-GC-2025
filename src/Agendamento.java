import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
    public static void main(String[] args) {
        // exercicio 1
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println("Dia do mês (novaData): " + novaData.getDayOfMonth());

        // exercicio 2
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println("Data do prazo: " + prazo);

        // exercicio 3
        LocalDate data = LocalDate.of(2025, 6, 10);
        int diasUteis = 0;

        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY ||
                    data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }

        System.out.println("Data após 7 dias úteis: " + data);

        // exercicio 4
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário.");
        } else {
            System.out.println("Tarefa enviada com sucesso.");
        }

    }

}
