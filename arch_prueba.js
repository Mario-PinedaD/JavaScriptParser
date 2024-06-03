// Declaración de variables
/* COMENTARIOS
MULTILINEAS */
let num1 = 10;
let result;

console.log("El valor de num1 es: " + num1);

// Bucle
console.log("Ciclo for:");
for (let i = 0; i < 5; i++) {
    console.log("Iteración " + i);
}

let j = 0;
while (j < 5) {
    console.log("Iteración " + j);
    j++;
}

function suma(a, b) {
    return a + b;
}

let sumaResult = suma(num1, num2);
console.log("Resultado de la función suma: " + sumaResult);

// Sentencias IF
if (num1 > num2) {
    console.log(num1 + " es mayor que " + num2);
} else if (num1 < num2) {
    console.log(num1 + " es menor que " + num2);
} else {
    console.log(num1 + " es igual a " + num2);
}

// Sentencias Switch-Case
let caso;

switch (dia) {
    case 0:
        caso = "Domingo";
        break;
    case 1:
	caso = "eldiavlo";
    default:
        caso = "Defaul";
}
console.log("El valor es = " + caso);

