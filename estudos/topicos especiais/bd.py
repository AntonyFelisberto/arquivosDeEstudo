#instalar com pip install mysql-connector-python
import mysql.connector

bd = mysql.connector.connect(
  host="localhost",
  user="root",
  password="",
  port="3306",
  database="loja"
)

print(bd)
cursor = bd.cursor()
cursor.execute("SHOW DATABASES")
for x in cursor:
  print(x)


def inserir_cliente_bd(nome, telefone):
    sql = f'INSERT INTO clientes (nome, telefone) VALUES ("{nome}", "{telefone}")'
    cursor.execute(sql)
    bd.commit()

def mostrar_clientes_bd():
    sql = "SELECT * FROM clientes"
    cursor.execute(sql)
    for x in cursor:
        print(x)

inserir_cliente_bd("Gustavo", "4399987-5555")
inserir_cliente_bd("Fernando", "4399991-7777")

mostrar_clientes_bd()