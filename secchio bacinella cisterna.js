function main() {
    window.alert("Ciao!");
    window.alert("cosa vuoi fare? secchio da 1 litro, bacinella da 0,2 litri o cisterna da 1000 litri?");
    var scelta;

    scelta = window.prompt('Enter a value for scelta');
    if (scelta == "secchio") {
        var litri, capacità, litritot;

        litritot = 0;
        capacità = 1000;
        window.alert("ok riempi il secchio fino a 1 litro (1000 ml)");
        while (litritot < capacità) {
            window.alert("Inserisci litri");
            window.alert(litritot);
            litri = Number(window.prompt('Enter a value for litri'));
            litritot = litri + litritot;
        }
        if (litri == capacità) {
            window.alert("hai riempito al 100%!");
        } else {
            window.alert("hai riempito troppo");
            window.alert(litritot);
        }
    } else {
        if (scelta == "bacinella") {
            var litri, capacità, litritot;

            litritot = 0;
            capacità = 200;
            window.alert("ok riempi la bacinella fino a 0,2 litri (200 ml)");
            while (litritot < capacità) {
                window.alert("Inserisci litri");
                window.alert(litritot);
                litri = Number(window.prompt('Enter a value for litri'));
                litritot = litri + litritot;
            }
            if (litri == capacità) {
                window.alert("hai riempito al 100%!");
            } else {
                window.alert("hai riempito troppo");
                window.alert(litritot);
            }
        } else {
            var litri, capacità, litritot;

            litritot = 0;
            capacità = 1000000;
            window.alert("ok riempi cisterna fino a 1000 litri (1000000 ml)");
            while (litritot < capacità) {
                window.alert("Inserisci litri");
                window.alert(litritot);
                litri = Number(window.prompt('Enter a value for litri'));
                litritot = litri + litritot;
            }
            if (litri == capacità) {
                window.alert("hai riempito al 100%!");
            } else {
                window.alert("hai riempito troppo");
                window.alert(litritot);
            }
        }
    }
    window.alert("digita fine");
    var fine;

    fine = window.prompt('Enter a value for fine');
}
