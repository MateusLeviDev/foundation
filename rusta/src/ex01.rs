const SECONDS_IN_MINUTE: u32 = 60;

fn main() {
    const MINUTES_IN_HOUR: u32 = 60;
    const SECONDS_IN_HOUR: u32 = SECONDS_IN_MINUTE * MINUTES_IN_HOUR;

    let worked_hours = 30;
    let worked_seconds_qtd = worked_hours * SECONDS_IN_HOUR;
    println!("{}", worked_seconds_qtd)
}