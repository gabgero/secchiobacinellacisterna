Write-Host 'Ciao!'
Write-Host 'cosa vuoi fare? secchio da 1 litro, bacinella da 0,2 litri o cisterna da 1000 litri?'
$scelta = Read-Host
If ($scelta -eq 'secchio') {
    $litritot = 0
    $capacità = 1000
    Write-Host 'ok riempi il secchio fino a 1 litro (1000 ml)'
    While ($litritot -lt $capacità) {
        Write-Host 'Inserisci litri'
        Write-Host $litritot
        [double] $litri = Read-Host
        $litritot = $litri + $litritot
    }
    If ($litri -eq $capacità) {
        Write-Host 'hai riempito al 100%!'
    } Else {
        Write-Host 'hai riempito troppo'
        Write-Host $litritot
    }
} Else {
    If ($scelta -eq 'bacinella') {
        $litritot = 0
        $capacità = 200
        Write-Host 'ok riempi la bacinella fino a 0,2 litri (200 ml)'
        While ($litritot -lt $capacità) {
            Write-Host 'Inserisci litri'
            Write-Host $litritot
            [double] $litri = Read-Host
            $litritot = $litri + $litritot
        }
        If ($litri -eq $capacità) {
            Write-Host 'hai riempito al 100%!'
        } Else {
            Write-Host 'hai riempito troppo'
            Write-Host $litritot
        }
    } Else {
        $litritot = 0
        $capacità = 1000000
        Write-Host 'ok riempi cisterna fino a 1000 litri (1000000 ml)'
        While ($litritot -lt $capacità) {
            Write-Host 'Inserisci litri'
            Write-Host $litritot
            [double] $litri = Read-Host
            $litritot = $litri + $litritot
        }
        If ($litri -eq $capacità) {
            Write-Host 'hai riempito al 100%!'
        } Else {
            Write-Host 'hai riempito troppo'
            Write-Host $litritot
        }
    }
}
Write-Host 'digita fine'
$fine = Read-Host
