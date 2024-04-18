function plusMinus(arr) {
  let array = ["", "", ""];
  let arrayCantidad = [0, 0, 0];

  arr.map((it) => {
    if (it == 0) arrayCantidad[2]++;
    else if (it > 0) arrayCantidad[0]++;
    else arrayCantidad[1]++;
  });

  array[0] = (arrayCantidad[0] / arr.length).toFixed(6);
  array[1] = (arrayCantidad[1] / arr.length).toFixed(6);
  array[2] = (arrayCantidad[2] / arr.length).toFixed(6);

  for (let item = 0; item <= 2; item++) {
    let result = array[item];

    if (array[item].length > 8) {
      let resultCopie = result;
      result = "";

      for (let it = 0; it <= 7; it++) 
        result += resultCopie[it];
    } else {
      for (let it = 0; it <= 7 - array[item].length; it++)
        result += "0";
    }

    document.getElementById("output").innerHTML += `<p>${result}</p>`;
  }
}

function runPlusMinus() {
  const input = document.getElementById("input").value;
  const arr = input.split(" ").map((it) => parseInt(it));
  plusMinus(arr);
}