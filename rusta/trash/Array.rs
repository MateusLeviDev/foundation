fn main() {
    //Array: os tipos devem ser iguais
    let numbers = [1, 2, 3];

    println!("{:?}", numbers[2]);

    //Slice
    println!("{:?}", &numbers[..3]); //exemplos: [1..3] - [0..] 
}