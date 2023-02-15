//testes
// no dia a dia teste e código de implementação andam próximos. implicando em diversas modificações.
import { expect, test } from "vitest";
import { Appointment } from "./appointment";

test("create and appointment", () => {
  const appointment = new Appointment({
    customer: "John Doe",
    statAt: new Date(),
    endAt: new Date(),
  });

  expect(appointment).toBeInstanceOf(appointment);
  expect(appointment.customer).toEqual("John Doe");
});
