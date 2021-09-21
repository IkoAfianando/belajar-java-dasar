function hello(data: string){
    return `Hello ${data}`;
}
const kembali = hello("Iko Afianando");
console.log(kembali);

const orang = function people(age: number) {
    for(let i: number = 1; i <= age; i++ ){
        if(i % 3 === 0 && i % 5 === 0){
            console.log(`FizzBuzz ${i}`);
        }else if(i % 3 === 0){
            console.log(`Fizz ${i}`);
        }else if(i % 3 === 0){
            console.log(`Buzz ${i}`);
        }else {
            console.log(i);
        }
    }
}

console.log(orang(100));


