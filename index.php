<?php
require_once 'db.php';

if ($_SERVER['REQUEST_METHOD'] === 'GET') {
    try {
        $sql = "SELECT * FROM camisas";
        $stmt = $pdo->query($sql);
        $camisas = $stmt->fetchAll(PDO::FETCH_ASSOC);

        echo json_encode($camisas);
    } catch (PDOException $e) {
        echo "Erro ao buscar camisas: " . $e->getMessage();
    }
}
?>
