<?php

$host = "localhost"; 
$dbname = "Sport"; 
$username = "Santz";  
$password = "Fashion28/11/2024";     

try {
    // Criando a conexão
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    echo "Erro ao conectar ao banco de dados: " . $e->getMessage();
    exit;
}
?>
