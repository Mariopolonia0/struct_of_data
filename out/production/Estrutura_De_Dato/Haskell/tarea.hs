
main = do
    let numero = [1..10]
    let nombre = ["Mario","Leuri","Eskerni","Juan","Tony","Carmen","Hector","Pricila","Priamo","Railin"]
    
    let combinacion = zip numero nombre

    putStrLn "El resultado de La Lista Es : "
    print (combinacion)

