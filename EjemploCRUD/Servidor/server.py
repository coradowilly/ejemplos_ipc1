from flask import Flask, request
from flask_restful import Api
from flask_cors import CORS, cross_origin

app = Flask(__name__)
CORS(app)
api = Api(app)

class Libro:
    nombre = ''
    paginas = 0

lista = list()


@app.route('/',methods = ['GET'])
def home():
    return 'Funciona la API'

@app.route('/getlibros',methods = ['GET'])
def getLibros():
    return 'Nombre: '+lista[0].nombre + '\nPaginas: ' + str(lista[0].paginas)

@app.route('/registro', methods = ['POST'])
def postLibro():
    content = request.get_json()
    nombre = content['nombre']
    paginas = content['paginas']

    nuevoLibro = Libro()
    nuevoLibro.nombre = nombre
    nuevoLibro.paginas = paginas
    lista.append(nuevoLibro)

    return {'message':'OK'}

if __name__ == '__main__':
    app.run(host= '0.0.0.0')
    app.run(debug=True)