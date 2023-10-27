const Arr1 = [33,21,19,87,23];  
const Arr2 = ['a','b','c','d','e','f'];

function Array_Sort(arr) { 
	arr.sort((a,b)=>b-a); 
	return arr; 
} 

function Arr_Sort_String(arr){
    arr.sort((a,b)=> (a > b ? - 1 : 1));
    return arr; 
}

console.log(Array_Sort(Arr1)); 
console.log(Arr_Sort_String(Arr2)); 
