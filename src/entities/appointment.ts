// padrão de classes
interface AppointmentProps {
  customer: string;
  statAt: Date;
  endAt: Date;
}

export class Appointment {
  private props: AppointmentProps;

  get customer() {
    return this.props.customer;
  }

  get startAt() {
    return this.props.statAt;
  }

  get endAt() {
    return this.props.endAt;
  }

  constructor(props: AppointmentProps) {
    this.props = props;
  }
}
