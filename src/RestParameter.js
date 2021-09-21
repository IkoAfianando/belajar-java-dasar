function fizzbuzz(data) {
    for (let i = 1; i <= 100; i++){
        const data1 = i % 3 === 0 && i % 5 === 0;
        const data2 = i % 3 === 0;
        const data3 = i % 5 === 0;
        if(data1) {
            console.log(`FizzBuzz ${i}`);
        }else if(data2){
            console.log(`Fizz ${i}`);
        }else if(data3){
            console.log(`Buzz ${i}`);
        }else {
            console.log(i);        }
    }
}

fizzbuzz(100);