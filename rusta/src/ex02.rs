fn main() {
    //tuple: tamanho fixo de elements. tipagem heterogenea
    let mut numbers = (1, "A", 3.5); //mut indica que a var é mutável
    numbers.0 = 20; 
    
    println!("{:?}", numbers.0)
}