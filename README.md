# Desarrollo de una API REST para gestión de productos y pedidos en e-commerce

El sistema gestiona productos, pedidos y clientes en un e-commerce. Los productos pueden tener múltiples pedidos y los clientes pueden realizar múltiples pedidos. La autenticación se realiza mediante JWT con roles de ADMIN y USER. La documentación se genera automáticamente con OpenAPI y Swagger UI. Los errores se manejan de manera centralizada y las entradas se validan. Los resultados se paginan y ordenan. Las pruebas unitarias y de integración se implementan con JUnit y Mockito. El sistema se containeriza con Docker.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura Empresarial con Spring Boot |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de datos y relaciones

**Objetivo:** Definir y modelar las entidades Product, Order y Customer con sus relaciones OneToMany y ManyToMany.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Identificar las entidades y sus atributos.
- Definir las relaciones entre las entidades.
- Modelar las entidades con Hibernate.

**Entregable:** Diagrama de clases con las entidades y sus relaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre las relaciones entre las entidades.
- Considera los atributos necesarios para cada entidad.

</details>

### Fase 2: Implementación de la capa de persistencia

**Objetivo:** Implementar la capa de persistencia con JPA y repositorios.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Crear los repositorios para las entidades.
- Implementar los métodos de consulta y persistencia.

**Entregable:** Repositorios implementados y probados.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre los métodos de consulta y persistencia necesarios.
- Considera las relaciones entre las entidades al implementar los repositorios.

</details>

### Fase 3: Implementación de la capa de servicios

**Objetivo:** Implementar la capa de servicios con lógica de negocio.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Crear los servicios para las entidades.
- Implementar la lógica de negocio en los servicios.

**Entregable:** Servicios implementados y probados.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre la lógica de negocio necesaria para cada entidad.
- Considera las relaciones entre las entidades al implementar los servicios.

</details>

### Fase 4: Implementación de la capa de controladores

**Objetivo:** Implementar la capa de controladores con endpoints REST.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Crear los controladores para las entidades.
- Implementar los endpoints REST.

**Entregable:** Controladores implementados y probados.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre los endpoints necesarios para cada entidad.
- Considera la autenticación y autorización al implementar los controladores.

</details>

### Fase 5: Implementación de pruebas unitarias y de integración

**Objetivo:** Implementar pruebas unitarias y de integración para la API.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crear pruebas unitarias para la capa de servicios.
- Crear pruebas de integración para los flujos principales.

**Entregable:** Pruebas unitarias y de integración implementadas y ejecutadas.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre los casos de prueba necesarios para cada capa.
- Considera los flujos principales al implementar las pruebas de integración.

</details>

### Fase 6: Containerización y despliegue

**Objetivo:** Containerizar la aplicación y desplegarla en un entorno de producción.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crear un Dockerfile multi-stage optimizado para producción.
- Containerizar la aplicación y desplegarla en un entorno de producción.

**Entregable:** Aplicación containerizada y desplegada en un entorno de producción.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre las mejores prácticas para containerizar y desplegar aplicaciones en producción.
- Considera la optimización del Dockerfile para producción.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una arquitectura en capas y cómo se aplica en este reto?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización basada en JWT en este sistema?
- **comoSeUsa**: ¿Cómo se usa la paginación y ordenamiento de resultados en los endpoints de listado?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar la capa de persistencia y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de pruebas unitarias y de integración en este reto?

## Criterios de Evaluacion

- Modelado correcto de las entidades y sus relaciones.
- Implementación correcta de la capa de persistencia.
- Implementación correcta de la capa de servicios.
- Implementación correcta de la capa de controladores.
- Implementación correcta de pruebas unitarias y de integración.
- Containerización y despliegue correctos de la aplicación.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
