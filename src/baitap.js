// tổng của 2 số
// let a = 5;
// let b = 10;
// console.log("sum is:", a + b );

// Kiểm tra số nguyên tố


// function primechuoiber (chuoiber){
//     if (chuoiber <2){
//         console.log("invalid");
//     } else {
//         for (i=0; i<= chuoiber; i++){
//             if (chuoiber % 2 ==0){
//                 return false;
//             }
//             else {
//                 return true;
//             }
//         }
//     }
// }
// const checkPrime = console.log( primechuoiber(5));



// tim số lớn nhất
function largestchuoiber(array) {
    let max = array[0];
    for(let i =1; i < array.length; i++){
        if( array[i] > max){
           max =array[i];
        }
    } 
    return max;
};
const arrchuoiberLarget = [111,52,42,121,231];
const checkLargetchuoiber = largestchuoiber(arrchuoiberLarget);

console.log(checkLargetchuoiber);

// đảo chuỗi 
function reverseString (arr2) {
    let chuoi = arr2[0];
    for(let i=chuoi2.length-1; i>=0; i--){
        chuoi += arr2[i];
        console.log(" " + chuoi+ " " );
    }
    return chuoi;
    
}

const chuoi2 = ["12","52","213","52"];
const reversedStr = reverseString(chuoi2);


// reverse characters

function reverseCharacters (str){
    let emptyString = "";
for (let i=str.length-1; i>=0 ; i--){
    emptyString+= str[i];
}
return emptyString;
}
const str = "abc";
const str2 = reverseCharacters(str);

console.log(str2)
